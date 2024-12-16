/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        // Your Code Goes here!
        int [] arr = {5,7,8,8,4,9,2,8,6};
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        int dupeCheck = 8;
        for(int i = 0; i < arr.length; i++){
            if (dupeCheck == arr[i]){
                System.out.println("there is a dupe at position " + i);
            }else{
                System.out.println("no dupe at pos " + i);
            }
        }
        for(int i = 0; i < arr.length-1; i++){
            if (arr[i+1] == arr[i]){
                System.out.println("there is a dupe at position " + i + " and " + (i+1));
            }
        }
	}
}