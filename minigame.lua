math.randomseed(os.time())

local numeroAleatorio = math.random(1, 100)
local tentativas = 0
local acertou = false

print("Bem-vindo ao Minigame de Adivinhação!")
print("Tente adivinhar o número entre 1 e 100.")

while not acertou do
    io.write("Digite seu palpite: ")
    local palpite = tonumber(io.read())
    tentativas = tentativas + 1

    if palpite < numeroAleatorio then
        print("Muito baixo! Tente novamente.")
    elseif palpite > numeroAleatorio then
        print("Muito alto! Tente novamente.")
    else
        acertou = true
        print("Parabéns! Você acertou o número em " .. tentativas .. " tentativas.")
    end
end
