$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/adicionar_produto.feature");
formatter.feature({
  "name": "Produto",
  "description": "\tAs Um cliente\n\tI quero acessar um site e-commerce\n\tIn para conseguir comprar produtos",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Adicionando produto ao carrinho com sucesso",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "que estou acessando a aplicacao",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.AdicionarProdutoSteps.que_estou_acessando_a_aplicacao()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo o produto",
  "keyword": "When "
});
formatter.match({
  "location": "steps.AdicionarProdutoSteps.informo_o_produto_produto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono pesquisar",
  "keyword": "And "
});
formatter.match({
  "location": "steps.AdicionarProdutoSteps.seleciono_pesquisar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escolho o item",
  "keyword": "And "
});
formatter.match({
  "location": "steps.AdicionarProdutoSteps.escolho_o_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "adiciono no carrinho",
  "keyword": "And "
});
formatter.match({
  "location": "steps.AdicionarProdutoSteps.adiciono_no_carrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Vizualizo o produto adicionado",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.AdicionarProdutoSteps.vizualizo_o_produto_adicionado()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});