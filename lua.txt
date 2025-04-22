function mostrarMenu()
    print("1. Dizer Olá")
    print("2. Somar dois números")
    print("3. Sair")
    io.write("Escolha uma opção: ")
end

function dizerOla()
    print("Olá!")
end

function somarNumeros()
    io.write("Digite o primeiro número: ")
    local a = tonumber(io.read())
    io.write("Digite o segundo número: ")
    local b = tonumber(io.read())
    print("Resultado: " .. (a + b))
end

local opcao = 0

while opcao ~= 3 do
    mostrarMenu()
    opcao = tonumber(io.read())

    if opcao == 1 then
        dizerOla()
    elseif opcao == 2 then
        somarNumeros()
    elseif opcao == 3 then
        print("Saindo...")
    else
        print("Opção inválida.")
    end

    print()
end
