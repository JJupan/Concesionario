package service;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Llanta {
    private int rin;

    public Llanta(int rin) {
        setRin(rin);
    }

    public Llanta() {
        this(0);
    }

    public void setRin(int rin) {

        this.rin = (rin <= 0) ? 10 : rin;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Llanta)) return false;
        Llanta otra = (Llanta) obj;
        return this.rin == otra.rin;
    }
}
