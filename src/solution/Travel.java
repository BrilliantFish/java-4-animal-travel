package solution;

public class Travel extends Handle {
    @Override
    public void solute() {
        int[] price = {500, 300, 400, 1000};
        String[] translation = {"driving a car", "taking bus", "train", "plane"};
        int n = 1;

        for (int i = 0; i < translation.length; i++){
            if (price[i] <= 500){
                System.out.println("第"+n+"种");
                System.out.println(translation[i]);
                n++;
            }
        }
    }
}
