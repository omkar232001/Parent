package Practice;

public class array {
    public static void main(String[] args) {
        int m,n, i, j, w;
        switch (w = 2) {
            case 1:
                System.out.println("2*2 Matrix");
                int row = 2;
                int column = 2;
                System.out.println("Matrix A=");
                int A[][] = new int[][]{{1, 2}, {3, 4}};
                for (i = 0; i < row; i++) {
                    for (j = 0; j < column; j++) {
                        System.out.print(A[i][j] + " ");
                    }
                    System.out.println(" ");
                }
                System.out.println("Matrix B=");
                int B[][] = new int[][]{{1, 2}, {3, 4}};
                for (i = 0; i < row; i++) {
                    for (j = 0; j < column; j++) {
                        System.out.print(B[i][j] + " ");
                    }
                    System.out.println(" ");
                }

                switch (n = 4) {
                    case 1:
                        System.out.println("Addition of Matrix");
                        int C1 = A[0][0] + B[0][0];
                        int C2 = A[0][1] + B[0][1];
                        int C3 = A[1][0] + B[1][0];
                        int C4 = A[1][1] + B[1][1];
                        int C[][] = new int[][]{{C1, C2}, {C3, C4}};
                        for (i = 0; i < row; i++) {
                            for (j = 0; j < column; j++) {
                                System.out.print(C[i][j] + " ");
                            }
                            System.out.println(" ");
                        }
                        break;
                    case 2:
                        System.out.println("Substraction of Matrix");
                        int D1 = A[0][0] - B[0][0];
                        int D2 = A[0][1] - B[0][1];
                        int D3 = A[1][0] - B[1][0];
                        int D4 = A[1][1] - B[1][1];
                        int D[][] = new int[][]{{D1, D2}, {D3, D4}};
                        for (i = 0; i < row; i++) {
                            for (j = 0; j < column; j++) {
                                System.out.print(D[i][j] + " ");
                            }
                            System.out.println(" ");
                        }
                        break;
                    case 3:
                        System.out.println("Multiplication of Matrix");
                        int E1 = A[0][0] * B[0][0] + A[0][1] * B[1][0];
                        int E2 = A[0][0] * B[0][1] + A[0][1] * B[1][1];
                        int E3 = A[1][0] * B[0][0] + A[1][1] * B[1][0];
                        int E4 = A[1][0] * B[0][1] + A[1][1] * B[1][1];
                        int E[][] = new int[][]{{E1, E2}, {E3, E4}};
                        for (i = 0; i < row; i++) {
                            for (j = 0; j < column; j++) {
                                System.out.print(E[i][j] + " ");
                            }
                            System.out.println(" ");
                        }
                        break;
                    case 4:
                        System.out.println("Value of Determinant");
                        int F1 = A[0][0] * A[1][1] - A[0][1] * A[1][0];
                        System.out.println(F1);
                        int F2 = B[0][0] * B[1][1] - B[0][1] * B[1][0];
                        System.out.println(F2);
                }
                break;
            case 2:
                System.out.println("3*3 Matrix");
                int x=3,y=3;
                System.out.println("Matrix A=");
                int[][] Z1 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
                for (i = 0; i < x; i++) {
                    for (j = 0; j < y; j++) {
                        System.out.print(Z1[i][j] + " ");
                    }
                    System.out.println(" ");
                }
                System.out.println("Matrix B=");
                int[][] Z2 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
                for (i = 0; i < x; i++) {
                    for (j = 0; j < y; j++) {
                        System.out.print(Z2[i][j] + " ");
                    }
                    System.out.println(" ");
                }
                switch (m = 4) {
                    case 1:
                        System.out.println("Multiplication of 3*3 Matrix");
                        int Q1 = Z1[0][0] * Z2[0][0] + Z1[0][1] * Z2[1][0] + Z1[0][2]*Z2[2][0];
                        int Q2 = Z1[0][0] * Z2[0][1] + Z1[0][1] * Z2[1][1] + Z1[0][2]*Z2[2][1];
                        int Q3 = Z1[0][0] * Z2[0][2] + Z1[0][1] * Z2[1][2] + Z1[0][2]*Z2[2][2];
                        int Q4 = Z1[1][0] * Z2[0][0] + Z1[1][1] * Z2[1][0] + Z1[1][2]*Z2[2][0];
                        int Q5 = Z1[1][0] * Z2[0][1] + Z1[1][1] * Z2[1][1] + Z1[1][2]*Z2[2][1];
                        int Q6 = Z1[1][0] * Z2[0][2] + Z1[1][1] * Z2[1][2] + Z1[1][2]*Z2[2][2];
                        int Q7 = Z1[2][0] * Z2[0][0] + Z1[2][1] * Z2[1][0] + Z1[2][2]*Z2[2][0];
                        int Q8 = Z1[2][0] * Z2[0][1] + Z1[2][1] * Z2[1][1] + Z1[2][2]*Z2[2][1];
                        int Q9 = Z1[2][0] * Z2[0][2] + Z1[2][1] * Z2[1][2] + Z1[2][2]*Z2[2][2];
                        int Q[][] = new int[][]{{Q1, Q2,Q3}, {Q4, Q5,Q6},{Q7,Q8,Q9}};
                        for (i = 0; i < x; i++) {
                            for (j = 0; j < y; j++) {
                                System.out.print(Q[i][j] + " ");
                            }
                            System.out.println(" ");
                        }
                        break;
                    case 2:
                        System.out.println("Addition of 3*3 Matrix");
                        int P1 = Z1[0][0] + Z2[0][0];
                        int P2 = Z1[0][1] + Z2[0][1];
                        int P3 = Z1[0][2] + Z2[0][2];
                        int P4 = Z1[1][0] + Z2[1][0];
                        int P5 = Z1[1][1] + Z2[1][1];
                        int P6 = Z1[1][2] + Z2[1][2];
                        int P7 = Z1[2][0] + Z2[2][0];
                        int P8 = Z1[2][1] + Z2[2][1];
                        int P9 = Z1[2][2] + Z2[2][2];
                        int P[][] = new int[][]{{P1, P2,P3}, {P4, P5,P6},{P7,P8,P9}};
                        for (i = 0; i < x; i++) {
                            for (j = 0; j < y; j++) {
                                System.out.print(P[i][j] + " ");
                            }
                            System.out.println(" ");
                        }
                        break;
                    case 3:
                        System.out.println("Substraction of 3*3 Matrix");
                        int O1 = Z1[0][0] - Z2[0][0];
                        int O2 = Z1[0][1] - Z2[0][1];
                        int O3 = Z1[0][2] - Z2[0][2];
                        int O4 = Z1[1][0] - Z2[1][0];
                        int O5 = Z1[1][1] - Z2[1][1];
                        int O6 = Z1[1][2] - Z2[1][2];
                        int O7 = Z1[2][0] - Z2[2][0];
                        int O8 = Z1[2][1] - Z2[2][1];
                        int O9 = Z1[2][2] - Z2[2][2];
                        int O[][] = new int[][]{{O1, O2,O3}, {O4, O5,O6},{O7,O8,O9}};
                        for (i = 0; i < x; i++) {
                            for (j = 0; j < y; j++) {
                                System.out.print(O[i][j] + " ");
                            }
                            System.out.println(" ");
                        }
                        break;
                    case 4:
                        System.out.println("Determinants of 3*3");
                        int L1=Z1[0][0]*(Z1[1][1]*Z1[2][2]-Z1[1][2]*Z1[2][1])-Z1[0][1]*(Z1[1][0]*Z1[2][2]-Z1[1][2]*Z1[2][0])+Z1[0][2]*(Z1[1][0]*Z1[2][1]-Z1[1][1]*Z1[2][0]);
                        System.out.println(L1);
                        int L2=Z2[0][0]*(Z2[1][1]*Z2[2][2]-Z2[1][2]*Z2[2][1])-Z2[0][1]*(Z2[1][0]*Z2[2][2]-Z2[1][2]*Z2[2][0])+Z2[0][2]*(Z2[1][0]*Z2[2][1]-Z2[1][1]*Z2[2][0]);
                        System.out.println(L2);
                        break;
                }
        }
    }
}






