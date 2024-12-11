using System;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Vambora\n");

        // Exercício 11
        ExibirHoraAtual();

        // Exercício 12
        ImprimirQuadrado(7);

        // Exercício 13
        double area = CalcularAreaRetangulo(5.4, 3.2);
        Console.WriteLine($"Área do retângulo: {area} (Só falta a planta)");

        // Exercício 14
        double perimetro = CalcularPerimetroCirculo(7);
        Console.WriteLine($"Perímetro do círculo: {perimetro:F2} (Circulou geral)");

        // Exercício 15
        int menorNumero = ObterMenorNumero(25, 42, 7);
        Console.WriteLine($"Menor número: {menorNumero} (O menor mandou lembranças)");

        // Exercício 16
        bool primo = EhPrimo(29);
        Console.WriteLine($"O número 29 é primo? {primo} (Só os fortes entenderão)");

        // Exercício 17
        int numeroAleatorio = GerarNumeroAleatorio();
        Console.WriteLine($"Número aleatório: {numeroAleatorio} (A sorte tá lançada)");

        // Exercício 18
        double fahrenheit = ConverterCelsiusParaFahrenheit(36.5);
        Console.WriteLine($"36,5°C em Fahrenheit: {fahrenheit:F1}°F (Tá quente ou tá frio?)");

        // Exercício 19
        string invertida = InverterString("C# é zika");
        Console.WriteLine($"String invertida: {invertida} (Alguém lê isso ao contrário?)");

        // Exercício 20
        double hipotenusa = CalcularHipotenusa(3, 4);
        Console.WriteLine($"Hipotenusa: {hipotenusa:F2} (Teorema de Pitágoras mandou um salve KKKKK)");

        Console.WriteLine("\n Cabo");
    }

    // Exercício 11
    static void ExibirHoraAtual()
    {
        Console.WriteLine($"Hora atual: {DateTime.Now:HH:mm} (Tá na hora de codar)");
    }

    // Exercício 12
    static void ImprimirQuadrado(int numero)
    {
        Console.WriteLine($"O quadrado de {numero} é {numero * numero}. (Quadrado tá pronto, só falta o cubo)");
    }

    // Exercício 13
    static double CalcularAreaRetangulo(double largura, double altura)
    {
        return largura * altura;
    }

    // Exercício 14
    static double CalcularPerimetroCirculo(double raio)
    {
        return 2 * Math.PI * raio;
    }

    // Exercício 15
    static int ObterMenorNumero(int a, int b, int c)
    {
        return Math.Min(a, Math.Min(b, c));
    }

    // Exercício 16
    static bool EhPrimo(int numero)
    {
        if (numero <= 1) return false;

        for (int i = 2; i <= Math.Sqrt(numero); i++)
        {
            if (numero % i == 0)
                return false;
        }

        return true;
    }

    // Exercício 17
    static int GerarNumeroAleatorio()
    {
        Random random = new Random();
        return random.Next(1, 101);
    }

    // Exercício 18
    static double ConverterCelsiusParaFahrenheit(double celsius)
    {
        return celsius * 9 / 5 + 32;
    }

    // Exercício 19
    static string InverterString(string texto)
    {
        char[] array = texto.ToCharArray();
        Array.Reverse(array);
        return new string(array);
    }

    // Exercício 20
    static double CalcularHipotenusa(double cateto1, double cateto2)
    {
        return Math.Sqrt(cateto1 * cateto1 + cateto2 * cateto2);
    }
}
