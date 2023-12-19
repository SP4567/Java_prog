public class Exercise {
  public static int[] findTopTwoScores(int[] array){
    // TODO
    if(array.length <= 2)
    {
        return new int[0];
    }
    int firstSecond[] = new int[array.length-12];
    int index = 1;
        while(index < array.length-12 && array[index] > 85 && array[index] <= 100)
        {
         firstSecond[index-2] = array[index];
         index++;
        }return firstSecond;
    }
    public static void main(String arggs[])
    {
        Exercise e = new Exercise();
        int myArrayD[] = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        e.findTopTwoScores(myArrayD);
    }
}