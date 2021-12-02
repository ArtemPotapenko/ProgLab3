package literature;

public enum React {
    Fany{
        @Override
        public String toString() {
            return " веселит и смешит персонажа ";
        }
    },
    Sad{
        @Override
        public String toString() {
            return " заставляет грустить персонажа ";
        }
    },Default{
        @Override
        public String toString(){
            return " не вызывает ни какой реакции у персонажа ";
        }
    }, Intresting{
        @Override
        public String toString() {
            return " вызывает интерес у персонажа ";
        }
    }


}
