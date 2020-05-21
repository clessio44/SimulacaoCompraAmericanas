Feature: Produto
	As Um cliente
	I quero acessar um site e-commerce
	In para conseguir comprar produtos

Scenario: Adicionando produto ao carrinho com sucesso
	Given que estou acessando a aplicacao
	When informo o produto
	And seleciono pesquisar
	And escolho o item
	And adiciono no carrinho
	Then Vizualizo o produto adicionado
