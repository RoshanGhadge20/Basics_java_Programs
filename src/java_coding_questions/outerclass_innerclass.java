package java_coding_questions;

class outerclass {
    public void call_outer() {
        System.out.println("calling outer class method");
    }

    class innerclass {

        public void call_inner() {
            System.out.println("Calling inner class method");
        }
    }
}

class outerclass_innerclass {

    public static void main(String[] args) {
        outerclass outer_obj = new outerclass();
        outerclass.innerclass inner_ojb = outer_obj.new innerclass();

        outer_obj.call_outer();
        inner_ojb.call_inner();

    }
}