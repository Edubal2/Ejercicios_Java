package pokemon;

abstract class Pokemon {
    int num_pokedex;
    String nombrePokemon;
    double pesoPokemon;
    String sexo;
    int generacion;
    String tipo;

    abstract void atacarPlacaje();
    abstract void atacarArañazo();
    abstract void atacarMordsco();

}
