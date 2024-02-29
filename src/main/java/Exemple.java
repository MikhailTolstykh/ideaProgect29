public class Exemple<T,V> {
    private String myString = "";

    public String getMyString() {
        return myString;
    }



    public void addTOString(T t,V v) {
        if (myString.equals("")) {
            this.myString = this.myString + t.toString()+v.toString();

        } else this.myString = this.myString + "\n" + t.toString()+v.toString();

    }

}