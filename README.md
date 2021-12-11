# FluxoCaixa-Java
Atividade prática - Programação Orientada à Objeto 

## O que foi feito
Pelo fato de ser apenas um MVP, criei 3 classes, que posteriormente vi que poderia ter nomeado melhor, mas enfim, as classe são :
- Category: guarda o tipo/categoria da entrada ou saída do Fluxo de Caixa, seja Combustível, Alimentação, Gás, Investimento, Energia Elétrica
  - id
  - name
- Product: guarda a informação se foi entrada ou saída e o valor, estando com o relacionamento de 1 category pra muitos products
  -  id
  -  name
  -  price
  -  category_id
- User: guarda informações do usuário
  - id
  - adress
  - email
  - name
  - password
  - phonenumber

Ao iniciar a aplicação o Spring rodará na porta 8080 do localhost:

http://localhost:8080


Fazendo um teste inicial de requisição na rota 'users' temos: 

http://localhost:8080/users


![image](https://user-images.githubusercontent.com/62885555/145514841-1ca812be-16ee-45f8-9b99-43a16fa69ea6.png)



Utilizei JPA com o h2-console criando um banco de dados apenas em memória por se tratar de um MVP, sendo a prova de conceito aprovada, provalmente mudaria pra um postgres ou um MySQL 
  - Para acesar o banco ao rodar o projeto : http://localhost:8080/h2-console
  - Ao acessar o link colocar a seguinte URL: jdbc:h2:mem:testdb
  - User: sa 
  - Password:
 
 
 Você deverá ver uma tela assim:
 
 ![image](https://user-images.githubusercontent.com/62885555/145514458-97ab75b1-460e-4d6d-b423-904b1d9b4bfd.png)
 
 No command Runner da aplicação eu setei categorias e produtos, ja incluindo relacionamentos, ao rodar a aplicação, o banco de dados fica da seguinte forma: 
 
 ![image](https://user-images.githubusercontent.com/62885555/145514583-4933b258-5f55-428c-851d-765def8707bd.png)
 
 
## Próximos Passos

Para continuar essa aplicação, devo criar os login, e de fato os cálculos do fluxo de caixa com suas respectivas validações e associações

# Escopo do Projeto

## Programas utilizados:
  - Eclipse IDE.
  - Plataforma Java SE.

## Contextualização:

Termo muito utilizado em contabilidade, o Fluxo de Caixa é um dos instrumentos queauxiliam no controle dos recursos monetários (receitas e despesas) de uma empresa,em um determinado período que pode ser diário, semanal, mensal, anual.

É a partir do fluxo de caixa que importantes decisões são tomadas em uma empresa,pois é através da utilização de seus dados, e de variáveis, que o administrador realizaprojeções futuras. Os principais dados para um fluxo de caixa são os seguintes:

   - Entradas: contas a receber, dinheiro de sócios, empréstimos, vendas, saldo de aplicações, cheques à vista, cheques pré-datados, entre outras.

  - Saídas: contas a pagar, compras à vista, pagamento de empréstimos, despesas gerais (custos fixos), salários, entre outras.

  As projeções futuras realizáveis através da utilização adequada do fluxo de caixa fornecem importantes informações que servem de subsídios para a tomada de decisões. É através do fluxo de caixa que se torna possível a integração das informações do caixa central, com as informações das contas de aplicação, contas correntes etc. 
  
  São exemplos de informações:
  
  - Prognosticar as necessidades de captação de recursos em determinado período,quando a projeção das saídas será maior do que as entradas.
  
  - Prever os períodos em que haverá sobras.
  - Aplicar as “sobras” nas alternativas mais rentáveis para a empresa, de forma a não comprometer a liquidez.
  - Avaliar projeções anteriores, as variações ocorridas e as causas dessas variações.
  - Avaliar a capacidade da empresa em gerar recursos para suprir o aumento dasnecessidades de capital de giro.
  - Idealizar projetos de expansão e investimento na empresa.
  
  Para tanto, a organização e o registro de todas as movimentações que envolvam recursos financeiros de forma sistemática são essenciais. As pequenas e médias empresas que não utilizam o fluxo de caixa como ferramenta, correm o risco de desconhecer as potencialidades e fragilidades relativas à sua saúde financeira em breve. Por fim, a utilização do fluxo de caixa como ferramenta para o controle das despesas pessoais possibilita que o cidadão possa fazer previsões antecipadas de eventuais despesas e sobras, para, a partir destas informações planejar seu futuro, tanto a curto como a longo prazo.


## Atividade


  Considere que você foi contrato por uma Startup do tipo Fintech. Fintech vem da junção
de Finanças com Tecnologia. O objetivo da empresa é criar uma carteira virtual que
sirva tanto para pequenas empresas como para pessoas físicas.
O software que você irá desenvolver é um protótipo e, portanto, não será necessário a
construção de uma interface gráfica.

### O software precisa ter:

Cadastro de usuários completo:
  - Nome.
  - Telefone.
  - Endereço.
  - E-mail.
  
### Cadastro de login:

  - User e Password
 
### Cadastro do fluxo de caixa:

  - Cadastro de entradas.
  -  Cadastro de saídas.
  - Impressão de relatórios, semanais e mensais. O usuário deverá escolher qual mêsou semana de um determinado mês para ver o fluxo de caixa. No final do relatóri sempre será necessário a impressão do saldo do total do fluxo de caixa (somatóriado que foi gasto e do que foi ganho).
  - Classificação quanto ao tipo de entrada nos seguintes grupos:
  - Salário (se for pessoa física).
  - Receita de vendas (Se for pessoa jurídica).
  - Investimentos (Tanto para pessoa física quanto pessoa Jurídica, aqui cabecoisas como rendimentos de aplicações, resgate de aplicações, aluguel etc.).
  - Classificação quanto ao tipo de despesas nos seguintes grupos:
  - Energia Elétrica.
  - Gás.
  - Alimentação (Se for empresa destacar apenas alimentação feita internamente,ou seja, por refeitório da própria empresa. Se for pessoa física deverá ser destacado o gasto feito com alimentação em casa e fora de casa).
  - Combustível e/ou locomoção.
  - Outros (Opção que deverá ser utilizada, caso o gasto não se encaixe emnenhuma das outras opções).
  
  O acesso ao fluxo de caixa deverá ser concedido somente através de autenticação, ou
seja, login. As informações do fluxo de caixa deverão ser salvas em disco por
serialização. Sempre que o software for iniciado as informações gravadas em disco
devem ser carregadas.

## Pontos a destacar:

  - O software será executado num servidor web. 
  - No fim deverão ser entregues ao cliente o software funcionando para testes bem como
todos os códigos e diagramas desenvolvidos.
