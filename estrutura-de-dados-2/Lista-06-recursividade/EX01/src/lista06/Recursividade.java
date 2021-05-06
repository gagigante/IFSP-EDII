package lista06;

public class Recursividade {
    public int fatorial(int n) {
        if(n == 1) return 1;
        return n * fatorial(n - 1);
    }
    
    public int maior(int[] v, int pos){
        if(pos == 0) return v[pos];
        int x = maior(v, pos - 1);
        if(x > v[pos - 1]) return x;
        return v[pos - 1];
    }
    
    public int produto(int[] v, int pos){
        if (pos == v.length - 1) return v[pos];
        return v[pos] * produto(v, pos + 1);
    }
    
    public int inverte(int[] v, int i, int f){
        if ((f - i) <= 0){
            imprime(v);
            return v[i];
        }
        int aux = v[i];
        v[i] = v[f];
        v[f] = aux;        
        return inverte(v, i + 1, f - 1);
    }
    
    public void imprime(int[] v){
        for(int n : v){
            System.out.print(n + " ");
        }
        System.out.println("");
    }
    
    public int mdc(int x, int y){
        if(x > y) return mdc(x - y, y);
        if(x == y) return x;
        return mdc(y, x);
    }
    
    public int modulo(int x, int y){
        if(x > y) return modulo(x - y, y);
        else if(x < y) return x;
        else return 0;
    }
}
