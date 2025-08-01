package medium;

public class IntegerToRoman_12 {
    public String intToRoman(int num) {
        String numInStr = String.valueOf(num);
        if(!(num<4000)){
            return numInStr;
        }

        int units = String.valueOf(num).length();
        int pos = 0;
        char letter = ' ';
        int soloNumber = 0;
        StringBuilder romanNumber = new StringBuilder();

        for(int i=0; i<units;i++){
            pos = units - i;

            if(pos==4){
                letter = numInStr.charAt(i);
                soloNumber = Character.getNumericValue(letter);
                
                romanNumber.append("M".repeat(soloNumber));

            }
            if(pos==3){
                letter = numInStr.charAt(i);
                soloNumber = Character.getNumericValue(letter);

                if(soloNumber>=1 && soloNumber <= 3){
                    romanNumber.append("C".repeat(soloNumber));
                }

                if(soloNumber==4){
                    romanNumber.append("CD");
                }

                if(soloNumber==5){
                    romanNumber.append("D");
                }

                if(soloNumber>=6 && soloNumber <= 8){
                    romanNumber.append("D");
                    romanNumber.append("C".repeat(soloNumber - 5));
                }

                if(soloNumber==9){
                    romanNumber.append("CM");
                }
            }
            if(pos==2){
                letter = numInStr.charAt(i);
                soloNumber = Character.getNumericValue(letter);

                if(soloNumber>=1 && soloNumber <= 3){
                    romanNumber.append("X".repeat(soloNumber));
                }

                if(soloNumber==4){
                    romanNumber.append("XL");
                }

                if(soloNumber==5){
                    romanNumber.append("L");
                }

                if(soloNumber>=6 && soloNumber <= 8){
                    romanNumber.append("L");
                    romanNumber.append("X".repeat(soloNumber - 5));
                }

                if(soloNumber==9){
                    romanNumber.append("XC");
                }
            }
            if(pos==1){
                letter = numInStr.charAt(i);
                soloNumber = Character.getNumericValue(letter);

                if(soloNumber>=1 && soloNumber <= 3){
                    romanNumber.append("I".repeat(soloNumber));
                }

                if(soloNumber==4){
                    romanNumber.append("IV");
                }

                if(soloNumber==5){
                    romanNumber.append("V");
                }

                if(soloNumber>=6 && soloNumber <= 8){
                    romanNumber.append("V");
                    romanNumber.append("I".repeat(soloNumber - 5));
                }

                if(soloNumber==9){
                    romanNumber.append("IX");
                }
            }
        }
        return romanNumber.toString();
    }

    public String intToRoman2(int num){
        if(!(num<4000)){
            return String.valueOf(num);
        }

        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds  = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens      = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units     = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return thousands[num / 1000] +
                hundreds[(num % 1000) / 100] +
                tens[(num % 100) / 10] +
                units[num % 10];
    }
    
}
