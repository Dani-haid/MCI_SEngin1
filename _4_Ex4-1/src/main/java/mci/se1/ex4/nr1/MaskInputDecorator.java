package mci.se1.ex4.nr1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MaskInputDecorator extends FilterInputStream {
    private static final char[] charsToMask = {'a', 'e', 'z'};
    protected MaskInputDecorator(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int readData = super.read();
        if (readData != -1) {
            char currentChar = (char) readData;
            if (toBeMasked(currentChar)) {
                return '*'; // Mask the character
            }
        }
        return readData;
    }

    private boolean toBeMasked(char ch){
        for (char element:charsToMask) {
            if(Character.toLowerCase(ch) == Character.toLowerCase(element)){
                return true;
            }
        }
        return false;
    }
}
