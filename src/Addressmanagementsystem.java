import Addressmanagement.*;

import javax.swing.*;

class Addressmanagementsystem {
    public String address(String postaladdress, String houseaddress, String schooladdress, String collegeaddress) {
        // System.out.println("enter a address"+postaladdress);
        System.out.println("enter a address" + houseaddress);
        System.out.println("enter a address" + schooladdress);
        System.out.println("enter a address" + collegeaddress);
        Addressmanagementsystem pin = new Addressmanagementsystem();
        pin.address("wer", "yer", "er", "rt");
        pin.address(121, 234, 343, 45);
        pin.address("wer", "ert", "rith", "ere");
        pin.address(121, 909, 12, 12);
        return null;
    }

    private long address(long pinpostaladdress, long pinhouseaddress, long pinschooladdress, long pincollegeaddress) {
        System.out.println("enter a pin" + pinpostaladdress);
        System.out.println("enter a pin" + pinhouseaddress);
        System.out.println("enter a pin" + pinschooladdress);
        System.out.println("enter a pin" + pincollegeaddress);
        {
            if (pinpostaladdress != pinschooladdress) {
                System.out.println(pinpostaladdress);
            } else if (pinhouseaddress != pinschooladdress) {
                System.out.println(pinhouseaddress);
            } else if (pinschooladdress != pincollegeaddress) {
                System.out.println(pinschooladdress);
            } else if (pincollegeaddress != pinpostaladdress) {
                System.out.println(pincollegeaddress);
            } else {
                System.out.println("null");
            }
        }
        return 2;
    }

    public static void main(String[] args) {
        Addressmanagementsystem n = new Addressmanagementsystem();
        System.out.println(n.address("wer", "yrt", "tre", "ter"));
      //  System.out.println();
    }
}
