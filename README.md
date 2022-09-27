<h1> 📚 Return no Java </h1>

### 🤔 O que é return em Java?

<p> O return serve para retornar algo dentro do método.

Todo método que não seja void está informando ao Java que ele
vai retornar um valor e, por isso, obrigatoriamente deverá
utilizar o return para devolver um valor.

Ele é uma instução de interrupção.

</p>

### O método executa seu retorno quando ?

```shell
    - Completa todas as instruções internas.
    - Chega a uma declaração explicita de retorno.
    - Lança uma exceção.
    - Se o método for sem retorno (void), pode ou não ter um
    "return" para encerrar sua execução.
    - O tipo de retorno do método é definido na sua criação e
    pode ser um tipo primitivo ou objeto.
    - O tipo de dado do return deve ser compatível com o do método.
    -
```

> Exemplos

### ✔️ Correto

```shell
    public String getMensagem(){
        return "Olá!";
    }

    public double getJuros(){
        return 2.36;
    }
```

### ❌ Erro de Compilação

```shell
    public int getParcelas(){
        return 1.36f;
    }

    public void setIdade(){
        return 10;
    }
```

### ✔️ Utilizando void com uma estrutura condicional

```shell
    public void executar(){
        ...
        return
        ...
    }
```
