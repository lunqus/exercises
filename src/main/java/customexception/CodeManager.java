package customexception;

import com.sun.xml.internal.bind.v2.model.core.ID;

public class CodeManager {

    public Coder find(String coderID) throws CoderNotFoundException {
        if (coderID.equals("123456")) {
            return new Coder();
        } else {
            throw new CoderNotFoundException(
                    "Could not find Coder with ID " + coderID);
        }
    }
}