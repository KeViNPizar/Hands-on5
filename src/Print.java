public class Print  {

    public  void imprimirPorRenglones(double[] sumaPorFilas) {
        System.out.println("ŷ = "+sumaPorFilas[0]+" + "+ sumaPorFilas[1]+"x1 + "  + sumaPorFilas[2]+"x2");
    }

    public  void imprimirPorRenglones2(double[] sumaPorFilas) {
        System.out.println("B0 = "+sumaPorFilas[0]+"\nB1 = "+ sumaPorFilas[1]+"\nB2 = "  + sumaPorFilas[2]+"");
    }

    public  void imprimirMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}
