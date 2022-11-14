public class JAWABANO3{

    public static void ubahHurufETostar(String[] huruf){
        for (int i=0; i<huruf.length;i++){
            System.out.println(huruf[i].replace("e", "*"));
        }
    }
    public static void main(String[] args) {
        String[] Block = new String[]{"triangle", "cubes", "circle"};
        ubahHurufETostar(Block);
    }
}