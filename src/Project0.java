import java.util.HashMap;

public class Project0 {
    public static void main(String[] args) {

    }
    public static void checkEnd(){

    }
}
interface Chesspieces{
    HashMap<Integer,Object> chess=new HashMap<>();
    void move();
    void checkAfterMove();
    void checkValidMove();
    void kishCheck();
    void hitCheck();


}
class King implements Chesspieces{
    private int iCoordinate;
    private int jCoordinate;
    King(int iCoordinate,int jCoordinate){
        this.iCoordinate=iCoordinate;
        this.jCoordinate=jCoordinate;
    }

    public int getiCoordinate() {
        return iCoordinate;
    }

    public int getjCoordinate() {
        return jCoordinate;
    }

    public void move(){

    }
    public void checkAfterMove(){

    }
    public void checkValidMove(){

    }
    public void kishCheck(){

    }
    public void hitCheck(){

    }
}
class Soldier implements Chesspieces{
    private int iCoordinate;
    private int jCoordinate;
    Soldier(int iCoordinate,int jCoordinate){
        this.iCoordinate=iCoordinate;
        this.jCoordinate=jCoordinate;
    }
    public int getiCoordinate() {
        return iCoordinate;
    }

    public int getjCoordinate() {
        return jCoordinate;
    }

    public void move(){

    }
    public void checkAfterMove(){

    }
    public void checkValidMove(){

    }
    public void kishCheck(){

    }
    public void hitCheck(){

    }
}
class Minister implements Chesspieces{
    private int iCoordinate;
    private int jCoordinate;
    Minister(int iCoordinate,int jCoordinate){
        this.iCoordinate=iCoordinate;
        this.jCoordinate=jCoordinate;
    }
    public int getiCoordinate() {
        return iCoordinate;
    }

    public int getjCoordinate() {
        return jCoordinate;
    }

    public void move(){

    }
    public void checkAfterMove(){

    }
    public void checkValidMove(){

    }
    public void kishCheck(){

    }
    public void hitCheck(){

    }
}
class Elephant implements Chesspieces{
    private int iCoordinate;
    private int jCoordinate;
    Elephant(int iCoordinate,int jCoordinate){
        this.iCoordinate=iCoordinate;
        this.jCoordinate=jCoordinate;
    }
    public int getiCoordinate() {
        return iCoordinate;
    }

    public int getjCoordinate() {
        return jCoordinate;
    }

    public void move(){

    }
    public void checkAfterMove(){

    }
    public void checkValidMove(){

    }
    public void kishCheck(){

    }
    public void hitCheck(){

    }
}
class Horse implements Chesspieces{
    private int iCoordinate;
    private int jCoordinate;
    Horse(int iCoordinate,int jCoordinate){
        this.iCoordinate=iCoordinate;
        this.jCoordinate=jCoordinate;
    }
    public int getiCoordinate() {
        return iCoordinate;
    }

    public int getjCoordinate() {
        return jCoordinate;
    }

    public void move(){

    }
    public void checkAfterMove(){

    }
    public void checkValidMove(){

    }
    public void kishCheck(){

    }
    public void hitCheck(){

    }
}
class Castle implements Chesspieces{
    private int iCoordinate;
    private int jCoordinate;
    Castle(int iCoordinate,int jCoordinate){
        this.iCoordinate=iCoordinate;
        this.jCoordinate=jCoordinate;
    }
    public int getiCoordinate() {
        return iCoordinate;
    }

    public int getjCoordinate() {
        return jCoordinate;
    }

    public void move(){

    }
    public void checkAfterMove(){

    }
    public void checkValidMove(){

    }
    public void kishCheck(){

    }
    public void hitCheck(){

    }
}

