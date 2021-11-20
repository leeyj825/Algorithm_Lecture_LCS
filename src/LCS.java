public class LCS<T extends Comparable<T>>{

    public Integer find(T[] first, T[] second){

        int c = first.length;
        int r = second.length;

        Integer[][] cmp = new Integer[c+1][r+1];
        for(int i=0; i<c+1; i++){
            for(int j=0; j<r+1; j++) {
                cmp[i][j] = 0;
            }
        }

        for(int i=1; i<r+1; i++){
            for(int j=1; j<c+1; j++){
                int tmp = second[i].compareTo(first[j]);
                if(tmp == 0){ //같은 경우
                    cmp[i][j] = cmp[i-1][j-1]+1;
                }
                else{ //다른 경우
                    cmp[i][j] = bigger(cmp[i - 1][j], cmp[i][j - 1]);
                }
            }
        }

        return cmp[c][r];

    }

    private Integer bigger(Integer a, Integer b) {
        if(a>b || a==b){
            return a;
        }
        else {
            return b;
        }
    }

}
