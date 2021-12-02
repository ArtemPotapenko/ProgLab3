package PeopDescrip;
public enum QualTeeth{
    VaryBad{
        @Override
        public String getQual() {
          return   "в очень плохом состаянии";
        }
    },Bad{
        @Override
        public String getQual() {
            return "требуют лечение";
        }
    },Default{
        @Override
        public String getQual() {
            return "обычные";
        }
    },Good{
        @Override
        public String getQual() {
            return "в очень хорошем состоянии";
        }
    },VeryHightLevel{
        @Override
        public String getQual(){
            return "ослепительно блесящие";
        }
    };

    @Override
    public String toString() {
        return getQual();
    }
    public String getQual(){
        return "";
    }
}
