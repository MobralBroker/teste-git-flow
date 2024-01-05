# Tutorial como utiliza o Git Flow

## Instalação

Para o Windows ele já vem junto ao github. Porém para o linux precisa instalar com os seguintes comandos:

```
sudo apt-get update 
sudo apt-get install git-flow
``` 

## Inicializar o Git Flow

Abra o seu novo repositório e digite:

``` git flow init ```

Após executar este comando no terminal ele irá fazer algumas perguntas referente a como você deseja a configuração do seu gitflow. Sendo elas:

1º Qual é o branch que será o de release para produção da sua aplicação? 
- *Aqui você pode manter o nome da branch de main ou criar uma nova, esta branch será responsavel por fazer o deploy da sua aplicação*

3º Qual é a Branch de Develop?
- *Aqui você pode manter o nome da branch de develop ou criar uma nova, esta branch será onde os desenvolvedores irão trabalhar*

4º Qual é a Branch de Feature?
- *Aqui você pode manter o nome da branch de feature ou criar uma nova, esta branch será onde os desenvolvedores irão trabalhar em novas features, e após a conclusão ela será unificada na branch develop e a branch da feature será excluida*

5º Qual é a branch de Bugfix?
- *Aqui você pode manter o nome da branch de bugfix ou criar uma nova, esta branch será onde os desenvolvedores corrigir os bug que surgirem na branch developer, e após a conclusão ela será unificada na branch develop e a branch da feature será excluida*

6º Qual é a branch de Release?
- *Aqui você pode manter o nome da branch de release ou criar uma nova, esta branch será onde os desenvolvedores irão subir a versão de release antes de ir para produção, assim a equipe responsável pelos testes irá trabalhar nesta branch, caso seja aprovada ela irá fazer um merge para main e para develop*

7º Qual é a branch de Hotfix?
- *Aqui você pode manter o nome da branch de hotfix ou criar uma nova, esta branch será onde os desenvolvedores irão fazer pequenas correções de bugs que surgir na versão da main, algo de urgencia. Então após a conclusão ela irá fazer o merge direto na main*

8º Qual é tag pré-fixada? ?
- *Aqui você pode determina o inicio das tag para quando for feito as releas.*

## Comandos do github flow

### Criar nova branch
Quando nós precisar desenvolver uma nova feature, teremos que criar uma branch especifica para esta feature. Então iremos utilizar o seguinte comando:

```
git flow feature start nome_da_feature_aqui
```

Após a implementação da feature, iremos adicionar os arquivos que queremos fazer o commit e depois criar este commit, com os seguintes comandos:

```
git add .
git commit -m "texto descrevendo o que foi feito no commit"
```

Então temos duas maneiras de subir este commit.

1º Caso nós finalizamos a implementação, e não temos mais nada a ser feito, iremos utilizar o comando a seguir, pois ele irá subir a nossa atualização para o develop e excluir a nossa branch de feature. 

```
git flow feature finish nome_da_feature_aqui
```

2º Caso ainda não terminamos a implementação, mas precisamos subir os commits, iremos utilizar o sequinte comando:

```
git flow feature publish nome_da_feature_aqui
```
Todos os comandos acima, pode ser utilizado para as demais branchs como hotfix, release e outras.

## Liberação do código para Release

Após a finalização das implementações do develop, iremos subir estas atualizaçãos para release com o seguinte comando:

```
git flow release start versão_da_release (1.0)
```

Após finaliza os testes iremos finalizar esta release com o seguinte comando:

```
git flow release finish versão_da_release (1.0)
```

Então ele irá atualizar a branch main e a develop. Ao executar este comando iremos colocar uma mensagem para a tag que esta sendo criada.

## Correção de bug na versão da MAIN

Caso encontre algum problema na versão da main, iremos utilizar o seguinte comando para criar uma branch de hotfix e fazer esta correção.

```
git flow hotfix start versão_da_hotfix (1.1)
```

E após a correção iremos fazer a atualização da branch main e develop com o seguinte comando:

```
git flow hotfix finish versão_da_hotfix (1.0)
```

No comando acima ele também irá pedir uma mensagem para a nova tag criada.

## Subir todas as branchs para o github

Para subir todos os branchs podemos utilizar o seguinte comando:

```
git push --all
```
