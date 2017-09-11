# Trabalho Final 


Esse trabalho consiste no desenvolvimento de um sistema Web utilizando as técnicas e tecnologias abordadas na disciplina, ou seja, um sistema baseado na tecnologia JEE 7 e suas principais APIs (EJB, JSF e JPA). O trabalho deverá ser desenvolvido em ** grupos de até 4 (quatro) alunos **. O sistema desenvolvido deverá necessariamente solucionar o problema descrito a seguir. Entretanto, o desenvolvimento de soluções que implementem funcionalidades adicionais é fortemente recomendado e será levado em consideração na avaliação final.  

O processo de desenvolvimento do sistema deverá seguir alguma metodologia bem conhecida, a critério de cada grupo, com a produção dos documentos e artefatos adequados. Estes serão apresentados em 3 etapas: especificação, projeto e implementação.  

* Na Etapa 1 (especificação) deverá ser apresentada uma especificação inicial do sistema, incluindo, minimamente, o Modelo de Casos de Uso, Modelo de Requisitos, Modelo de Dados Conceitual (Diagrama Entidade-Relacionamento), a descrição da Arquitetura do Sistema e o Modelo de Interação, além de outros documentos que cada grupo considerar necessário. Esta documentação deve descrever os módulos funcionais que comporão o sistema e deverá ser apresentada ** até o dia 09/10/2017 **.  

* Na Etapa 2 (projeto) deverá ser apresentada um projeto detalhado do sistema, incluindo, minimamente, os Diagramas de Classes, os Diagramas de Sequência, o Modelo de Dados Lógico, o Plano de Testes, além de outros documentos que cada grupo considerar necessário. Esta documentação deve indicar que módulos (conjuntos de classes) cada aluno componente do grupo será responsável por implementar. Esta parte do trabalho deverá ser entregue ** até o dia 08/11/2017 **.  

* Na Etapa 3 (implementação) o sistema completo deve ser apresentado e submetido aos testes de aceitação previstos no Plano de Testes. Nesta etapa, a documentação completa do sistema deve ser revista e reapresentada, e um Manual do Usuário do sistema deve ser elaborado. Esta parte do trabalho deverá ser concluída ** até o dia 11/12/2017 **.

## Descrição Geral do Problema  

A coordenação do Curso de Sistemas de Informação necessita de um Sistema de Gerenciamento de Atividades para organizar, principalmente, a participação de professores na orientação de alunos em Projetos Finais de Curso (TCC 1 e 2).  

Os usuários deste sistema serão professores do IC ou outros setores da UFF (desde que autorizados), que poderão ser Orientadores ou Membros de banca, e  alunos de graduação, que poderão estar inscritos em Projeto Final 1 (TCC1), Projeto Final 2 (TCC2). Estes usuários poderão se registrar no sistema fornecendo dados básicos, como nome e função (que está associada ao tipo de usuário), e definindo login e senha. Ao logar no sistema, poderão descrever outros aspectos, como áreas de atuação ou interesse.  

Para administrar esse sistema será designado um funcionário da coordenação do curso que terá o papel de ** Administrador ** e será responsável por cadastrar (ou validar o cadastramento) dos usuários (professores e alunos), controlar as inscrições em disciplinas e auxiliar no o agendamento das defesas. Inicialmente, ele deverá incluir no sistema a lista de professores e semestralmente validar a inclusão de alunos inscritos em Projeto Final 1 e 2.  

No papel de ** Orientador **, os professores poderão registrar Projetos associando a estes um ou dois alunos, desde que estes estejam inscritos na mesma atividade. Para projetos que tem ** Alunos de TCC1 **, após a solicitação do Administrador (no fim do semestre), eles poderão atribuir uma nota. Para projetos que tem ** Aluno de TCC2 **, após a solicitação do Administrador (no fim do semestre), eles poderão solicitar a marcação de uma banca, definindo dia e hora e convidando ** Membros da Banca **, que devem confirmar via sistema. O Administrador deve validar o agendamento informando a sala. Após a defesa o Orientador poderá lançar uma nota final.  

No papel de ** Aluno de TCC1 **, os alunos poderão solicitar orientação a um professor orientador, editar os dados de um projeto (título, resumo, cronograma, bibliografia, etc), enquanto não for validado pelo orientador. No papel de ** Aluno de TCC2 **, os alunos poderão fazer o upload de PDFs contendo as versões preliminar e final do TCC.  

A qualquer momento, qualquer usuário (logado ou não), poderá consultar páginas que descrevem as atividades de um professor, exibindo a lista de orientações em andamento ou finalizadas. Poderá ainda consultar páginas com listas de todos os trabalhos em andamento, indicando alunos e orientadores, e listas de todos os trabalhos concluídos, indicando alunos e orientadores. É desejável que essas informações possam também ser exportadas como arquivos XML.  

O sistema deverá ainda ser capaz de enviar notificações de prazos para inscrição, conclusão de etapas e agendamento de defesas.