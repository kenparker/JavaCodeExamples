package com.maggioni.otherexamples;

/**
 *
 * http://java67.blogspot.de/2014/12/2-ways-to-print-custom-string-value-of.html
 */
public class EnumWithCustomString {

    public static void main(String[] args) {
        
        System.out.println("Default String value of Enum Color.RED is " +  Color.RED);
        
        System.out.println("Default String value of Enum ColorWithToString.RED is "+ ColorWithToString.RED);
        
        System.out.println("Default String value of Enum ColorWithSpecificString.RED is "+ ColorWithSpecificString.RED.getCustomString());
    }

    private enum Color {
        RED, GREEN, BLUE;
    }
    
    private enum ColorWithToString {

        RED {

                    @Override
                    public String toString() {
                        return "Red";
                    }
                },
        GREEN {

                    @Override
                    public String toString() {
                        return "Green";
                    }
                },
        BLUE {

                    @Override
                    public String toString() {
                        return "Blue";
                    }
                };
    }
    
    private enum ColorWithSpecificString {

        RED("red"), BLUE("blue"), GREEN("green");

        private String custom;

        private ColorWithSpecificString(String custom) {
            this.custom = custom;
        }

        public String getCustomString() {
            return custom;
        }

    }
}
