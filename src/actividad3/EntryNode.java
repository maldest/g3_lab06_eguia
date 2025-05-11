package actividad3;

public class EntryNode <E, N> {
    E data; //elementos datos
    N priority; //prioridad


    //concstrutor
    EntryNode(E data, N priority){
        this.data = data;
        this.priority = priority;
    }
}
