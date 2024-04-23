import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeracaoJson {
    // Criar bonito
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void escreveArquivo(EnderecoCep endereco) throws IOException {
        FileWriter escrita = new FileWriter(endereco.cep() + ".json");
        escrita.write(gson.toJson(endereco));
        escrita.close();
    }

}
