package silptech.developerabhi.calculator;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    Button one, two, three, four, five, six, equals, seven, eight, nine, zero, add, sub, mul, div, dot, clr, back;
    int dotClick = 0;
    double firstdigit, seconddigit, finaldigit;
    int operatorclick = 0;
    int p = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = (Button) findViewById(R.id.btnone);
        two = (Button) findViewById(R.id.btntwo);
        three = (Button) findViewById(R.id.btnthree);
        four = (Button) findViewById(R.id.btnfour);
        five = (Button) findViewById(R.id.btnfive);
        six = (Button) findViewById(R.id.btnsix);
        seven = (Button) findViewById(R.id.btnseven);
        eight = (Button) findViewById(R.id.btneight);
        nine = (Button) findViewById(R.id.btnnine);
        zero = (Button) findViewById(R.id.btnzero);
        add = (Button) findViewById(R.id.btnadd);
        sub = (Button) findViewById(R.id.btnsubtract);
        mul = (Button) findViewById(R.id.btnmultiplication);
        div = (Button) findViewById(R.id.btndivision);
        dot = (Button) findViewById(R.id.btndot);
        clr = (Button) findViewById(R.id.btnclr);
        equals = (Button) findViewById(R.id.btnequal);
        back = (Button) findViewById(R.id.back);
        result = (TextView) findViewById(R.id.resultdisplay);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = result.getText().toString();
                result.setText(s.substring(0, s.length() - 1));
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText(result.getText().toString() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "2");

            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "3");

            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "0");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dotClick = 0;
                if (operatorclick == 0) {
                    operatorclick = 1;
                    p = 1;
                    firstdigit = Double.parseDouble(result.getText().toString());
                    result.setText("");
                } else if (operatorclick == 1) {
                    seconddigit = Double.parseDouble(result.getText().toString());
                    firstdigit = firstdigit + seconddigit;
                    result.setText("");
                } else if (operatorclick == 2) {
                    seconddigit = Double.parseDouble(result.getText().toString());
                    firstdigit = firstdigit - seconddigit;
                    result.setText("");
                } else if (operatorclick == 3) {
                    seconddigit = Double.parseDouble(result.getText().toString());
                    firstdigit = firstdigit * seconddigit;
                    result.setText("");
                } else if (operatorclick == 4) {
                    seconddigit = Double.parseDouble(result.getText().toString());
                    firstdigit = firstdigit / seconddigit;
                    result.setText("");
                }
                p = 1;

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dotClick = 0;
                if (operatorclick == 0) {

                    operatorclick = 2;
                    p = 2;
                    firstdigit = Double.parseDouble(result.getText().toString());
                    result.setText("");
                } else if (operatorclick == 1) {
                    p = 1;
                    seconddigit = Double.parseDouble(result.getText().toString());
                    firstdigit = firstdigit + seconddigit;
                    result.setText("");
                } else if (operatorclick == 2) {
                    p = 2;

                    seconddigit = Double.parseDouble(result.getText().toString());
                    firstdigit = firstdigit - seconddigit;
                    result.setText("");
                } else if (operatorclick == 3) {
                    p = 3;

                    seconddigit = Double.parseDouble(result.getText().toString());
                    firstdigit = firstdigit * seconddigit;
                    result.setText("");
                } else if (operatorclick == 4) {
                    p = 4;
                    seconddigit = Double.parseDouble(result.getText().toString());
                    firstdigit = firstdigit / seconddigit;
                    result.setText("");
                }
                p = 2;
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       dotClick = 0;
                                       if (operatorclick == 0) {
                                           operatorclick = 3;
                                           p = 3;
                                           firstdigit = Double.parseDouble(result.getText().toString());
                                           result.setText("");
                                       } else if (operatorclick == 1) {
                                           p = 1;

                                           seconddigit = Double.parseDouble(result.getText().toString());

                                           firstdigit = firstdigit + seconddigit;
                                           result.setText("");
                                       } else if (operatorclick == 2) {

                                           p = 2;
                                           seconddigit = Double.parseDouble(result.getText().toString());
                                           firstdigit = firstdigit - seconddigit;
                                           result.setText("");
                                       } else if (operatorclick == 3) {

                                           p = 3;
                                           seconddigit = Double.parseDouble(result.getText().toString());
                                           firstdigit = firstdigit * seconddigit;
                                           result.setText("");
                                       } else if (operatorclick == 4) {

                                           p = 4;
                                           seconddigit = Double.parseDouble(result.getText().toString());
                                           firstdigit = firstdigit / seconddigit;
                                           result.setText("");
                                       }
                                       p = 3;
                                   }
                               }

        );
        div.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                dotClick = 0;
                if (operatorclick == 0) {
                    operatorclick = 4;
                    p = 4;
                    firstdigit = Double.parseDouble(result.getText().toString());
                    result.setText("");
                } else if (operatorclick == 1) {
                    p = 1;
                    seconddigit = Double.parseDouble(result.getText().toString());
                    firstdigit = firstdigit + seconddigit;
                    result.setText("");
                } else if (operatorclick == 2) {
                    p = 2;
                    seconddigit = Double.parseDouble(result.getText().toString());
                    firstdigit = firstdigit - seconddigit;
                    result.setText("");
                } else if (operatorclick == 3) {
                    p = 3;
                    seconddigit = Double.parseDouble(result.getText().toString());
                    firstdigit = firstdigit * seconddigit;
                    result.setText("");
                } else if (operatorclick == 4) {
                    p = 4;
                    seconddigit = Double.parseDouble(result.getText().toString());
                    firstdigit = firstdigit / seconddigit;
                    result.setText("");
                }
                p = 4;
            }

        });
        dot.setOnClickListener(new View.OnClickListener()

                               {
                                   @Override
                                   public void onClick(View v) {
                                       if (dotClick == 0) {
                                           result.setText(result.getText().toString() + ".");
                                           dotClick++;
                                       }

                                       //if(!dotClick.getText().toString().contains("."){
                                       //   result.setText(result.getText().toString() + ".");
                                       // }
                                   }
                               }

        );
        clr.setOnClickListener(new View.OnClickListener()

                               {
                                   @Override
                                   public void onClick(View v) {
                                       result.setText("");
                                       dotClick = 0;
                                   }
                               }

        );
        equals.setOnClickListener(new View.OnClickListener()

                                  {
                                      @Override
                                      public void onClick(View v) {
                                          operatorclick = 0;
                                          seconddigit = Double.parseDouble(result.getText().toString());

                                          if (p == 1) {
                                              finaldigit = firstdigit + seconddigit;

                                          }
                                          if (p == 2) {
                                              finaldigit = firstdigit - seconddigit;

                                          }
                                          if (p == 3) {
                                              finaldigit = firstdigit * seconddigit;

                                          }
                                          if (p == 4) {
                                              finaldigit = firstdigit / seconddigit;

                                          }

                                          result.setText(String.valueOf(finaldigit));
                                      }
                                  }

        );

    }
}
