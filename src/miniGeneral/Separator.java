package miniGeneral;

public class Separator {

    int[] array = new int[] {1,2,3,4,5,6,7,8};



    int even(){
        int a = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                a++;
            }
        }
        int[] b = new int[a];
        for (int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                b[i] = array[i];
            }
        }
        return a;
    }






    int odd(){
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){

            }else{
                System.out.println(array[i]);
            }
        }
        return 0;
    }
}
