package literature;
public enum Booksizе {
    Mini{
        @Override
        public String toString() {
            return " маленького объема страниц";
        }
    },Big{
        @Override
        public String toString() {
            return " большого объема страниц";
        }
    },Medium{
        @Override
        public String toString(){
            return " среднего размера страниц";
        }
    };
}
