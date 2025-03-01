package com.devsuperior.dslist.services;
import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.projections.GameMinProjection;
import com.devsuperior.dslist.repositories.GameListRepository;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;


    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }

    public void move(Long listId, int sourceIndex, int destinationIndex) {

        List<GameMinProjection> list = gameRepository.searchByList(listId); // Procurar jogos na lista

        GameMinProjection obj = list.remove(sourceIndex); // Remove o jogo do índice de origem
        list.add(destinationIndex, obj); // Insere o jogo no índice de destino

        //Forma limpa com menos caracteres
        int min = Math.min(sourceIndex, destinationIndex);
        int max = Math.max(sourceIndex, destinationIndex);

        //Forma não limpa com mais caracteres
        //int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        //int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        // Caso o sourceIndex seja menor que o destinationIndex,
        // o min é sourceIndex, caso contrário, o min é destinationIndex

        // "?" é um operador que age como um "if" caso a condição seja verdadeira
        // ":" é um operador que age como um "else" caso a condição seja verdadeira
        // "<" significa "menor que" e ">" significa "maior que"

        // o mínimo e o máximo são representados como o chão e o teto de uma lista
        // onde os jogos são os moradores dela, e o mínimo é o valor mais próximo ao chão
        // enquanto o máximo é o que está mais próximo ao teto

        // Em uma tabela, para mover um dado de uma posição para outra,
        // indo do maior para o menor (ou vice-versa), que nesse caso
        // Seriam o "destino" e "origem".

        for (int i = min; i <= max; i++) {
            gameRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
            // Salva o jogo na posição correta na lista
        }

        // Boas práticas de get, put, post, delete, patch, head e options
        // get -> Retorna dados
        // put -> Atualiza dados
        // post -> Cria dados
        // delete -> Deleta dados
        // patch -> Atualiza dados parcialmente
        // head -> Retorna cabeçalhos HTTP
        // options -> Retorna métodos suportados
         

    }



}