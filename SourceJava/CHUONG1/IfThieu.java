public class IfElse {
    public static void main(String[] args){
        int diem=9;
        
        if((diem>10) || (diem<0)){
            System.out.println("Diem nhap vao khong hop le!");
        } else if(diem>=9){
            System.out.println("Xuat sac!");
        } else if(diem>=6.5){
            System.out.println("Kha!");
        } else if(diem>=5){
            System.out.println("Trung binh!");
        } else if(diem>=3.5){
            System.out.println("Yeu!");
        } else {
            System.out.println("Kem!");
        }
    }
}
