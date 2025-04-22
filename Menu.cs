using System;

class Program
{
    static void Main()
    {
        int opcao = 0;

        while (opcao != 3)
        {
            Console.Clear();
            Console.WriteLine("Menu Principal:");
            Console.WriteLine("1. Mostrar Olá");
            Console.WriteLine("2. Somar dois números");
            Console.WriteLine("3. Sair");
            Console.Write("Escolha uma opção: ");
            
            opcao = Convert.ToInt32(Console.ReadLine());

            switch (opcao)
            {
                case 1:
                    Console.WriteLine("Olá!");
                    break;
                case 2:
                    Console.Write("Digite o primeiro número: ");
                    int num1 = Convert.ToInt32(Console.ReadLine());
                    Console.Write("Digite o segundo número: ");
                    int num2 = Convert.ToInt32(Console.ReadLine());
                    Console.WriteLine("Resultado da soma: " + (num1 + num2));
                    break;
                case 3:
                    Console.WriteLine("Saindo...");
                    break;
                default:
                    Console.WriteLine("Opção inválida. Tente novamente.");
                    break;
            }

            if (opcao != 3)
            {
                Console.WriteLine("\nPressione qualquer tecla para voltar ao menu...");
                Console.ReadKey();
            }
        }
    }
}
