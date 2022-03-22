public class funcaoTeste {
    static int funcao(int x) {
        if(x<1) return 0;
        int ret=0;
        while(x>0) {
            ret+=x;
            x--;
        }
        return ret;
    }
    public static void main(String[] args) {
        int x=0;
        System.out.println(funcao(x));
        x=funcao(x+3); 
        System.out.println(funcao(x));
        System.out.println(funcao(10));
    }
}
