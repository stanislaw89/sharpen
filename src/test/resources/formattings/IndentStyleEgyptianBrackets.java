package formattings;

import java.util.Arrays;

public class IndentStyleEgyptianBrackets {

    public int field1;
    public long field2;
    public String field3;


    public void blocks() {
        while (field1 > 0) {
            field1--;
            if (field1 % 10 == 0) {
                break;
            }
        }
        for (long i = 0; i < field2; i++) {
            if (i % 100 == 0) {
                field1++;
            }
        }
        do {
            field1--;
        } while (field1 > 10);

        for (Integer v : Arrays.asList(1, 2, 3)) {
            System.out.println(v);

            switch (v) {
                case 1:
                    System.out.println("a");
                    break;
                case 2: {
                    System.out.println("b");
                    break;
                }
                default: {
                    System.out.println("");
                }
            }
        }

    }

    public void method1(int v) {
        field1 = v;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    private static class InnerClass {
        public long field1;
        public long field2;

        public InnerClass() {
        }

        public InnerClass(long field1, long field2) {
            this.field1 = field1;
            this.field2 = field2;
        }

        public void method1(long v) {
            field1 = v;
        }

        public void method2(long v) {
            field2 = v;
        }

    }

    public enum MyEnum1 {
        VALUE1,
        VALUE2,
        VALUE3,
    }

}