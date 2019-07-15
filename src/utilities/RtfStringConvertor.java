/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>Converts java Strings according to RTF conventions.</p>
 *
 * <p>This work was authored by Bertrand Delacretaz (bdelacretaz@codeconsult.ch).</p>
 */

public final class RtfStringConvertor {

    private static final RtfStringConvertor INSTANCE = new RtfStringConvertor();
    private static final Map SPECIAL_CHARS;
    private static final Character DBLQUOTE = new Character('\"');
    private static final Character QUOTE = new Character('\'');
    private static final Character SPACE = new Character(' ');

    /** List of characters to escape with corresponding replacement strings */
    static {
        SPECIAL_CHARS = new HashMap();
        SPECIAL_CHARS.put(new Character('\t'), "tab");
        SPECIAL_CHARS.put(new Character('\n'), "line");
        SPECIAL_CHARS.put(new Character('\''), "rquote");
        SPECIAL_CHARS.put(new Character('\"'), "rdblquote");
        SPECIAL_CHARS.put(new Character('\\'), "\\");
        SPECIAL_CHARS.put(new Character('{'), "{");
        SPECIAL_CHARS.put(new Character('}'), "}");
    }

    /** singleton pattern */
    private RtfStringConvertor() {
    }

    /**
     * use this to get an object of this class
     * @return the singleton instance
     */
    public static RtfStringConvertor getInstance() {
        return INSTANCE;
    }

    /**
     * Write given String to given Writer, converting characters as required by
     * RTF spec
     * @param w Writer
     * @param str String to be written
     * @throws IOException for I/O problems
     */
    public void writeRtfString(Writer w, String str) throws IOException {
        if (str == null) {
            return;
        }
        w.write(escape(str));
    }

    public static void main(String args[]) {

        RtfStringConvertor cvt = new RtfStringConvertor();
        System.out.println(cvt.escape(
                "The brain has been scanned with contrast."
                + "No intra or extra-axial mass is  identified."
                + "Normal ventricular system."
                + "I cannot see any focal ischaemia or haemorrhage."
                + "Extra-axial spaces are clear."
                + "No posterior fossa abnormality is seen."
                + "There is no abnormal enhancement post contrast."
                + "The optic chiasm outlines normally."));
    }

    /**
     * Escapes a String as required by the RTF spec.
     * @param str String to be escaped
     * @return the escaped string
     */
    public String escape(String str) {
        if (str == null) {
            return null;
        }

        StringBuffer sb = new StringBuffer(Math.max(16, str.length()));
        // TODO: could be made more efficient (binary lookup, etc.)
        for (int i = 0; i < str.length(); i++) {
            final Character c = new Character(str.charAt(i));
            Character d;
            String replacement;
            if (i != 0) {
                d = new Character(str.charAt(i - 1));
            } else {
                d = new Character(str.charAt(i));
            }

            //This section modified by Chris Scott
            //add "smart" quote recognition
            if (c.equals((Object)DBLQUOTE) && d.equals((Object)SPACE)) {
                replacement = "ldblquote";
            } else if (c.equals((Object)QUOTE) && d.equals((Object)SPACE)) {
                replacement = "lquote";
            } else {
                replacement = (String)SPECIAL_CHARS.get(c);
            }

            if (replacement != null) {
                // RTF-escaped char
                sb.append('\\');
                sb.append(replacement);
                sb.append(' ');
            } else if (c.charValue() > 127) {
                // write unicode representation - contributed by Michel Jacobson
                // <jacobson@idf.ext.jussieu.fr>
                sb.append("\\u");
                sb.append(Integer.toString((int)c.charValue()));
                sb.append("\\\'3f");
            } else {
                // plain char that is understood by RTF natively
                sb.append(c.charValue());
            }
        }
        return sb.toString();
    }

}