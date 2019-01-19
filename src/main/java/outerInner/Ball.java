package outerInner;

public class Ball { // Outer class

    private String ballName;
    private int ballSize;

    public void setUpBall() {

    }

    // Inner Class
    class OrangeBall {

        public void setUpOrangeBall() {

            ballName = "Inside Inner Class Ball";
            ballSize = 23;

        }

    }
}
