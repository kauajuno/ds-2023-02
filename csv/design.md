# Software a ser descrito

Um software que lê um arquivo no formato CSV e, para cada linha, calcula a soma das duas primeiras colunas e gera um arquivo CSV, contendo as mesmas linhas, mas o arquivo gerado contém uma coluna adicional que a soma obtida para cada linha.

# Descrição em etapas


- Dentro de uma função, recebe-se por parâmetro uma cópia do arquivo CSV
- Instancia-se uma cópia desse CSV recebido por parâmetro 
- Aloca-se um array com o tamanho da quantidade de linhas do arquivo CSV
- Para cada linha do arquivo CSV, soma-se o valor das duas primeiras colunas e atribua esse valor à posição correspondente no array
- Coloca-se esse array como a última coluna do CSV instanciado
- Retorna-se esse CSV modificado
