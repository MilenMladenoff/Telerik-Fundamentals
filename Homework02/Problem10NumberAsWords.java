package Homework02;

import java.util.Scanner;

public class Problem10NumberAsWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());

        if (number == 0) {
            System.out.println("Zero");
        }

        int hundreds = number / 100;

        switch (hundreds) {
            case 0:
                System.out.print("");
                break;
            case 1:
                System.out.print("One hundred and ");
                break;
            case 2:
                System.out.print("Two hundred and ");
                break;
            case 3:
                System.out.print("Three hundred and ");
                break;
            case 4:
                System.out.print("Four hundred and ");
                break;
            case 5:
                System.out.print("Five hundred and ");
                break;
            case 6:
                System.out.print("Six hundred and ");
                break;
            case 7:
                System.out.print("Seven hundred and ");
                break;
            case 8:
                System.out.print("Eight hundred and ");
                break;
            case 9:
                System.out.print("Nine hundred and ");
                break;
        }

        number = number % 100;
        int tens = number / 10;

        switch (tens) {
            case 0:
                System.out.print("");
                break;
            case 1:

                switch (number) {
                    case 10:
                        if (hundreds == 0) {
                            System.out.print("Ten");
                        } else {
                            System.out.print("ten");
                        }
                        break;
                    case 11:
                        if (hundreds == 0) {
                            System.out.print("Eleven");
                        } else {
                            System.out.print("eleven");
                        }
                        break;
                    case 12:
                        if (hundreds == 0) {
                            System.out.print("Twelve");
                        } else {
                            System.out.print("twelve");
                        }
                        break;
                    case 13:
                        if (hundreds == 0) {
                            System.out.print("Thirteen");
                        } else {
                            System.out.print("thirteen");
                        }
                        break;
                    case 14:
                        if (hundreds == 0) {
                            System.out.print("Fourteen");
                        } else {
                            System.out.print("fourteen");
                        }
                        break;
                    case 15:
                        if (hundreds == 0) {
                            System.out.print("Fifteen");
                        } else {
                            System.out.print("fifteen");
                        }
                        break;
                    case 16:
                        if (hundreds == 0) {
                            System.out.print("Sixteen");
                        } else {
                            System.out.print("sixteen");
                        }
                        break;
                    case 17:
                        if (hundreds == 0) {
                            System.out.print("Seventeen");
                        } else {
                            System.out.print("seventeen");
                        }
                        break;
                    case 18:
                        if (hundreds == 0) {
                            System.out.print("Eighteen");
                        } else {
                            System.out.print("eighteen");
                        }
                        break;
                    case 19:
                        if (hundreds == 0) {
                            System.out.print("Nineteen");
                        } else {
                            System.out.print("nineteen");
                        }
                        break;
                }
                break;

            case 2:
                if (hundreds == 0) {
                    System.out.print("Twenty ");
                } else {
                    System.out.print("twenty ");
                }
                break;
            case 3:
                if (hundreds == 0) {
                    System.out.print("Thirty ");
                } else {
                    System.out.print("thirty ");
                }
                break;
            case 4:
                if (hundreds == 0) {
                    System.out.print("Forty ");
                } else {
                    System.out.print("forty ");
                }
                break;
            case 5:
                if (hundreds == 0) {
                    System.out.print("Fifty ");
                } else {
                    System.out.print("fifty ");
                }
                break;
            case 6:
                if (hundreds == 0) {
                    System.out.print("Sixty ");
                } else {
                    System.out.print("sixty ");
                }
                break;
            case 7:
                if (hundreds == 0) {
                    System.out.print("Seventy ");
                } else {
                    System.out.print("seventy ");
                }
                break;
            case 8:
                if (hundreds == 0) {
                    System.out.print("Eighty ");
                } else {
                    System.out.print("eighty ");
                }
                break;
            case 9:
                if (hundreds == 0) {
                    System.out.print("Ninety ");
                } else {
                    System.out.print("ninety ");
                }
                break;
        }

        if (tens != 1) {
            number = number % 10;

            switch (number) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    if (hundreds == 0 && tens == 0) {
                        System.out.print("One");
                    } else {
                        System.out.print("one");
                    }
                    break;
                case 2:
                    if (hundreds == 0 && tens == 0) {
                        System.out.print("Two");
                    } else {
                        System.out.print("two");
                    }
                    break;
                case 3:
                    if (hundreds == 0 && tens == 0) {
                        System.out.print("Three");
                    } else {
                        System.out.print("Three");
                    }
                    break;
                case 4:
                    if (hundreds == 0 && tens == 0) {
                        System.out.print("Four");
                    } else {
                        System.out.print("four");
                    }
                    break;
                case 5:
                    if (hundreds == 0 && tens == 0) {
                        System.out.print("Five");
                    } else {
                        System.out.print("five");
                    }
                    break;
                case 6:
                    if (hundreds == 0 && tens == 0) {
                        System.out.print("Six");
                    } else {
                        System.out.print("six");
                    }
                    break;
                case 7:
                    if (hundreds == 0 && tens == 0) {
                        System.out.print("Seven");
                    } else {
                        System.out.print("seven");
                    }
                    break;
                case 8:
                    if (hundreds == 0 && tens == 0) {
                        System.out.print("Eight");
                    } else {
                        System.out.print("eight");
                    }
                    break;
                case 9:
                    if (hundreds == 0 && tens == 0) {
                        System.out.print("Nine");
                    } else {
                        System.out.print("nine");
                    }
                    break;
            }
        }
    }
}
