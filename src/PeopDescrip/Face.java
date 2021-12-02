package PeopDescrip;
import MainClasses.DefQual.*;
import java.util.Objects;

import static MainClasses.DefQual.*;

public class Face {

    String nose = Default_male;
    String arm = Default_male;
    String eyes = Default_plural;
    String this_face = Default_neuter;
    QualTeeth teeh = QualTeeth.Default;
    String upper_lip = Default_female;
    String ears = Default_plural;

    protected Face(){}

    @Override
    public String toString() {
        return "Нос: " + nose + "  Рот:  " + arm + "  Глаза: " + eyes + "   Лицо: " + this_face + "   Зубы: " + teeh + "   Верхня губа: " + upper_lip
                + "   Уши:" + ears + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Face face = (Face) o;
        return Objects.equals(nose, face.nose) && Objects.equals(arm, face.arm) && Objects.equals(eyes, face.eyes) && Objects.equals(this_face, face.this_face) && teeh == face.teeh && Objects.equals(upper_lip, face.upper_lip) && Objects.equals(ears, face.ears);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nose, arm, eyes, this_face, teeh, upper_lip, ears);
    }


}
