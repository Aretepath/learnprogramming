public class Main {
    public static void main(String[] args) {
        int count = 1;
//        while(count != 6){
//            System.out.println("Count Value is "+ count);
//            count++;
//        }
//
//        count = 1;
//        System.out.println("--------------");
//        while(true) {
//            if(count==6) {
//                break;
//            }
//            System.out.println("Count Value is "+ count);
//            count++;
//        }
//        count = 1;
//        do {
//            System.out.println("Count Value was " + count);
//            count++;
//        } while(count != 6);

        //System.out.println("Hello world!");

//        int number = 4;
//        int finishNumber = 20;
//
//        while (number <= finishNumber){
//            number++;
//            if(!isEvenNumber(number)){
//                continue;
//            }
//
//            System.out.println("Even Number " + number);
//        }

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even Number " + number);
            evenNumbersFound++;
            if(evenNumbersFound >= 5){
                break;
            }

        }

        System.out.println("Total Even Numbers Found = " +evenNumbersFound);

    }
    public static boolean isEvenNumber(int number){
        if((number % 2) == 0){
            return true;
        }else {
            return false;
        }
    }

}

//same in forloop format

//        for(count = 1; count !=6; count++){
//                System.out.println("Count Value is "+ count);
//                }