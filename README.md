<h1>Teste de caixa branca</h1> 
<h2>O que é o teste de caixa branca</h2> 
O teste de caixa branca tem como objetivo se atentar sobre o funcionamento interno do sistema, aplicando testes nas estruturas internas. Os resuldados possibilitam análise relacionada ao código-fonte do sistema.
<h2>Sobre</h2> 
Esse read.me tem a finalidade de apontar os erros encontrados no código.
<h2>Erros encontrados</h2> 
  <ul>
    <li>
      Concatenação de Strings para consulta SQL: O código poderia ter separação do úsuario e senha na url, sendo mais fácil a legibilidade e manutenção do código;
    </li>
  </ul> 
<h2>Observações a serem feitas</h2>
  <ul>
    <li>
      Não há documentação que explica a finalidade das classes, métodos e variáveis não foi descrita no código;
    </li>
    <li>
      Public class User e public boolean verificarUsuario
    </li>
    <li>
      Base de dados desprotegida
    </li>
    <li>
      Não há tratamento adequado para exceções;
    </li>
  </ul>
  <h2>Grafo de fluxo</h2>
  <img src="TesteCaixaBranca/img/grafo de fluxo (1).png">
  <h2>Cálculo da complexidade ciclomática</h2>
  <p>V(G) = E - N + 2</p>
  <p>V(G) = 15 - 14 + 2</p>
  <p>V(G) = 3</p>
  <h2>Caminhos possíveis</h2>
  <h3>Sucesso na consulta</h3>
  <p>1-2-3-4-5-7-8-9-10-12-13-14</p>
  <h3>Falha na consulta</h3>
  <p>1-2-3-4-5-7-8-11-12-13-14</p>
  <h3>Exceção na consulta SQL</h3>
  <p>1-2-3-4-6-13-14</p>

  <h2>Comentários no código</h2>
  <p>Os comentários foram adicionados para explicar a função de cada ação realizada no código</p>
