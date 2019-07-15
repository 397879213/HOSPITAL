/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler;

import BO.BookIssue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.GenerateKeys;

/**
 *
 * @author Pacslink
 */
public class BookIssueHandler {

    GenerateKeys key = new GenerateKeys();

    String[] BColumns = {"-", "ID", "REFERENCE_ID", "MEMBER_TYPE_ID",
        "NAME", "AGE", "GENDER_ID", "GENDER_DES", "CNIC", "PROGRAM",
        "DEPARTMENT_ID", "DEPARTMENT_DES", "CONTACT_NO", "MAX_BOOK_LIMIT",
        "LOCATION_ID", "LOCATION_DES", "INSTITUE", "MEMBER_ID", "BOOK_ID",
        "STATUS_ID", "ISSUE_DATE", "ISSUED_BY", "BOOK_ISSUANCE_ID", "RETURN_DATE",
        "BOOK_COLLECT_BY", "FINE_DAY_1", "FINE_DAY_2", "FINE_DAY_3",
        "EXTRA_DAYS", "FINE", "TOTAL_PAYABLE_FINE", "TOTAL_RECEIVED_FINE",
        "RESERVED_BY", "RESERVED_DATE", "CANCEL_BY", "CANCEL_DATE",
        "CRTD_BY", "CRTD_DATE", "CRTD_TERMINAL_ID"};

    String generalQuery
            = " SELECT M.ID,  "
            + " M.MEMBER_REFERENCE_ID                REFERENCE_ID,         \n"
            + " M.MEMBER_TYPE_ID                     MEMBER_TYPE_ID,       \n"
            + " M.NAME                               NAME,                 \n"
            + " M.AGE                                AGE,                  \n"
            + " M.GENDER_ID                          GENDER_ID,            \n"
            + " GEN.DESCRIPTION                      GENDER_DES,           \n"
            + " M.CNIC                               CNIC,                 \n"
            + " M.PROGRAM                            PROGRAM,              \n"
            + " M.DEPARTMENT_ID                      DEPARTMENT_ID,        \n"
            + " M.CONTACT_NO                         CONTACT_NO,           \n"
            + " M.CRTD_BY                            CRTD_BY,              \n"
            + " LOC.DESCRIPTION                      LOCATION_DES,         \n"
            + " DEP.DESCRIPTION                      DEPARTMENT_DES,       \n"
            + " TO_CHAR(M.CRTD_DATE,'DD-MON-YY')     CRTD_DATE,            \n"
            + " BID.BOOK_ISSUANCE_ID                 BOOK_ISSUANCE_ID,     \n"
            + " BID.MEMBER_ID                        MEMBER_ID,            \n"
            + " BID.BOOK_ID                          BOOK_ID,              \n"
            + " BID.STATUS_ID                        STATUS_ID,            \n"
            + " TO_CHAR(BID.ISSUE_DATE,'DD-MON-YY')  ISSUE_DATE,           \n"
            + " BID.ISSUED_BY                        ISSUED_BY             \n"
            + " FROM "
//            + Database.DCMS.member + " M,                                  \n"
  //          + Database.DCMS.bookIssueDetail + " BID,                       \n"
            + Database.DCMS.users + " USR,                                 \n"
            + Database.DCMS.location + " LOC                               \n"
            + Database.DCMS.definitionTypeDetail + " DEP,                  \n"
            + Database.DCMS.gender + " GEN                                 \n";

    String generalJoin
            = " AND  M.ID = BID.MEMBER_ID                                   \n"
            + " AND M.CRTD_BY = USR.USER_NAME                               \n"
            + " AND M.LOCATION_ID = LOC.ID                                  \n"
            + " AND M.DEPARTMENT_ID = DEP.ID                                \n";

    public List setInformation(List list) {

        List<BookIssue> ListEmer = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            HashMap map = (HashMap) list.get(0);
            BookIssue obj = new BookIssue();
            obj.setId(map.get("ID").toString());
            obj.setReferenceId(map.get("REFERENCE_ID").toString());
            obj.setTypeId(map.get("MEMBER_TYPE_ID").toString());
            obj.setName(map.get("NAME").toString());
            obj.setAge(map.get("AGE").toString());
            obj.setAge(map.get("GENDER_ID").toString());
            obj.setGenderDescription(map.get("GENDER_DES").toString());
            obj.setCnic(map.get("CNIC").toString());
            obj.setProgram(map.get("PROGRAM").toString());
            obj.setContactNo(map.get("CONTACT_NO").toString());
            obj.setCrtdBy(map.get("CRTD_BY").toString());
            obj.setLocationDescription(map.get("LOCATION_DES").toString());
            obj.setLocationDescription(map.get("DEPARTEMENT_ID").toString());
            obj.setDepartmentDescription(map.get("DEPARTMENT_DES").toString());
            obj.setCrtdDate(map.get("CRTD_DATE").toString());
            obj.setBookIssuanceId(map.get("BOOK_ISSUANCE_ID").toString());
            obj.setMemberId(map.get("MEMBER_ID").toString());
            obj.setBookId(map.get("BOOK_ID").toString());
            obj.setStatusId(map.get("STATUS_ID").toString());
            obj.setIssueBy(map.get("ISSUED_BY").toString());
            obj.setIssueDate(map.get("ISSUE_DATE").toString());

            ListEmer.add(obj);
        }
        return ListEmer;
    }
    
    
     public List<BookIssue> selectMember(List<BookIssue> list) {

        String query = generalQuery
                + " WHERE M.ID = BID.MEMBER_ID"
                + generalJoin + " ORDER BY ID ";

        return setInformation(Constants.dao.selectData(query, BColumns));
    }
     
   
         public static void main(String args[]) {
        BookIssueHandler obj = new BookIssueHandler();
        List<BookIssue> list = new ArrayList<>();
        list = obj.selectMember(list);
    }

}
