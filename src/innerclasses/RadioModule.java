package innerclasses;

public class RadioModule {      //  RadioModule Class

    public RadioModule() {
        System.out.println("Radiomodule initialized");
    }

    public void call(String number) {       // Method call
        int lenght = 10;

        class GSMModule {                            //  GSMModule Class
            private String phoneNumber;
            private int validNumber;

            public GSMModule(String phoneNumber) {
                this.phoneNumber = phoneNumber;
            }

            public boolean isValid() {
                if (phoneNumber.length() != lenght)
                    return false;
                else {
                    try {
                        validNumber = Integer.parseInt(phoneNumber);
                        return true;
                    } catch (NumberFormatException e) {
                        return false;
                    }
                }
            }

            public void dialIn() {
                if (isValid()) {
                    System.out.println("Dialing phone number " + validNumber);
                } else {
                    System.out.println("Phone number is Invalid");
                }
            }


        }                                           //  END of GSMModule Class
        GSMModule module = new GSMModule(number);
        module.dialIn();


    }       // END of Method call

}   //  END of RadioModule Class
