package org.karane;

import org.karane.functional.*;

public class Main {
    public static void main(String[] args) {

        String[] noArgs = new String[]{};

        BuiltInFunctionalInterfaces.main(noArgs);
        CustomFunctionalInterface.main(noArgs);
        TriFunctionExample.main(noArgs);
        TriFunctionStreamExample.main(noArgs);
        ConsumerExamples.main(noArgs);
        TriConsumerExample.main(noArgs);

    }
}
