package com.example.otvio.piano;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Environment;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import junit.framework.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends ActionBarActivity {
    static final String LOG_TAG = MainActivity.class.getSimpleName();

    private Context context;

    Button a,as, b, c, c2, cs, d, ds,
            e, f, fs, g, gs, rec, recS, read;
    MediaPlayer mp = new MediaPlayer();

    CheckBox check;
    boolean stopFile, an, asn, bn, cn, c2n, csn,
            dn, dsn, en, fn, fsn, gn, gsn;

    Timer tmr1 = new Timer(true), tmr4 = new Timer(true);
    TimerTask tmr2, tmr3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(R.layout.activity_main);

        a = (Button)findViewById(R.id.a);
        as = (Button)findViewById(R.id.as);
        b = (Button)findViewById(R.id.b);
        c = (Button)findViewById(R.id.c);
        cs = (Button)findViewById(R.id.cs);
        c2 = (Button)findViewById(R.id.c2);
        d = (Button)findViewById(R.id.d);
        ds = (Button)findViewById(R.id.ds);
        e = (Button)findViewById(R.id.e);
        f = (Button)findViewById(R.id.f);
        fs = (Button)findViewById(R.id.fs);
        g = (Button)findViewById(R.id.g);
        gs = (Button)findViewById(R.id.gs);
        rec = (Button)findViewById(R.id.rec);
        recS = (Button)findViewById(R.id.recS);
        read = (Button)findViewById(R.id.read);
        check = (CheckBox)findViewById(R.id.check);
        check.setVisibility(View.VISIBLE);
        rec.setVisibility(View.VISIBLE);
        recS.setVisibility(View.INVISIBLE);
        read.setVisibility(View.VISIBLE);

        a.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN ||
                        event.getAction() == MotionEvent.ACTION_CANCEL) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.a);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }

                    });
                    mp.start();
                    an = true;
                    return true;
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    an = false;
                    return true;
                }
                return false;
            }
        });

        as.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN ||
                        event.getAction() == MotionEvent.ACTION_CANCEL) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.as);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }

                    });
                    mp.start();
                    asn = true;
                    return true;
                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    asn  = false;
                    return true;
                }
                return false;
            }
        });


        b.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN ||
                        event.getAction() == MotionEvent.ACTION_CANCEL) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.b);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }

                    });
                    mp.start();
                    bn = true;
                    return true;
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    bn = false;
                    return true;
                }
                return false;
            }
        });

        c2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN ||
                        event.getAction() == MotionEvent.ACTION_CANCEL) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.c2);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }

                    });
                    mp.start();
                    c2n = true;
                    return true;
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    c2n = false;
                    return true;
                }
                return false;
            }
        });

        c.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN ||
                        event.getAction() == MotionEvent.ACTION_CANCEL) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.c);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }

                    });
                    mp.start();
                    cn = true;
                    return true;
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    cn = false;
                    return true;
                }
                return false;
            }
        });

        cs.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN ||
                        event.getAction() == MotionEvent.ACTION_CANCEL) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.cs);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }

                    });
                    mp.start();
                    csn = true;
                    return true;
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    csn = false;
                    return true;
                }
                return false;
            }
        });

        d.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN ||
                        event.getAction() == MotionEvent.ACTION_CANCEL) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.d);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }

                    });
                    mp.start();
                    dn = true;
                    return true;
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    dn = false;
                    return true;
                }
                return false;
            }
        });

        ds.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN ||
                        event.getAction() == MotionEvent.ACTION_CANCEL) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.ds);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }

                    });
                    mp.start();
                    dsn = true;
                    return true;
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    dsn = false;
                    return true;
                }
                return false;
            }
        });

        e.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN ||
                        event.getAction() == MotionEvent.ACTION_CANCEL) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.e);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }

                    });
                    mp.start();
                    en = true;
                    return true;
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    en = false;
                    return true;
                }
                return false;
            }
        });

        f.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN ||
                        event.getAction() == MotionEvent.ACTION_CANCEL) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.f);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }

                    });
                    mp.start();
                    fn = true;
                    return true;
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    fn = false;
                    return true;
                }
                return false;
            }
        });

        fs.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN ||
                        event.getAction() == MotionEvent.ACTION_CANCEL) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.fs);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }

                    });
                    mp.start();
                    fsn = true;
                    return true;
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    fsn = false;
                    return true;
                }
                return false;
            }
        });

        g.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN ||
                        event.getAction() == MotionEvent.ACTION_CANCEL) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.g);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }

                    });
                    mp.start();
                    gn = true;
                    return true;
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    gn = false;
                    return true;
                }
                return false;
            }
        });

        gs.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN ||
                        event.getAction() == MotionEvent.ACTION_CANCEL) {
                    mp = MediaPlayer.create(MainActivity.this, R.raw.gs);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }

                    });
                    mp.start();
                    gsn = true;
                    return true;
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    gsn = false;
                    return true;
                }
                return false;
            }
        });

        rec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    record();
                    recS.setVisibility(View.VISIBLE);
                    check.setVisibility(View.INVISIBLE);
                    rec.setVisibility(View.INVISIBLE);
                    read.setVisibility(View.INVISIBLE);
                } catch (IOException e) {

                }
            }
        });

        recS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopFile = true;
                rec.setVisibility(View.VISIBLE);
                recS.setVisibility(View.INVISIBLE);
                read.setVisibility(View.VISIBLE);
                check.setVisibility(View.VISIBLE);
            }
        });

        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    readFile();
                }
                catch (IOException ex){

                }
            }
        });
    }

    public void record() throws IOException{

        File dir;
        File fil;
        FileWriter writer;

        stopFile = false;

        dir = getAlbumStorageDir("Musics");
        fil = new File(dir, "music.txt");

        if(check.isChecked()) {
            fil.delete();
            fil = new File(dir, "music.txt");
        }

        writer = new FileWriter(fil, true);

        final PrintWriter f1 = new PrintWriter(writer, true);

        tmr3 = new TimerTask() {
            @Override
            public void run() {
                if(!stopFile) {
                    if (an)
                        f1.println("a");
                    else if (asn)
                        f1.println("as");
                    else if (bn)
                        f1.println("b");
                    else if (cn)
                        f1.println("c");
                    else if (c2n)
                        f1.println("c2");
                    else if (csn)
                        f1.println("cs");
                    else if (dn)
                        f1.println("d");
                    else if (dsn)
                        f1.println("ds");
                    else if (en)
                        f1.println("e");
                    else if (fn)
                        f1.println("f");
                    else if (fsn)
                        f1.println("fs");
                    else if (gn)
                        f1.println("g");
                    else if (gsn)
                        f1.println("gs");
                    else
                        f1.println(".");
                }
                else
                    tmr3.cancel();
            }
        };
        tmr4.scheduleAtFixedRate(tmr3, 50, 50);
    }

    public File getAlbumStorageDir(String albumName) {
        // Get the directory for the user's public pictures directory.
        File file = new File(Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_DOCUMENTS), albumName);
        if (!file.mkdirs()) {
            Log.e(LOG_TAG, "Directory not created");
        }
        return file;
    }

    public void readFile() throws IOException{

        FileReader reader;
        reader = new FileReader(getAlbumStorageDir("Musics")+"/music.txt");
        final BufferedReader rd = new BufferedReader(reader);
        String linha = rd.readLine();

        tmr2 = new TimerTask() {
            @Override
            public void run() {
                try {
                    String nota = rd.readLine();
                    if(nota != null) {
                        switch (nota) {
                            case "a":
                                mp = MediaPlayer.create(context, R.raw.a);
                                break;
                            case "as":
                                mp = MediaPlayer.create(context, R.raw.as);
                                break;
                            case "b":
                                mp = MediaPlayer.create(context, R.raw.b);
                                break;
                            case "c":
                                mp = MediaPlayer.create(context, R.raw.c);
                                break;
                            case "c2":
                                mp = MediaPlayer.create(context, R.raw.c2);
                                break;
                            case "d":
                                mp = MediaPlayer.create(context, R.raw.d);
                                break;
                            case "ds":
                                mp = MediaPlayer.create(context, R.raw.ds);
                                break;
                            case "e":
                                mp = MediaPlayer.create(context, R.raw.e);
                                break;
                            case "f":
                                mp = MediaPlayer.create(context, R.raw.f);
                                break;
                            case "fs":
                                mp = MediaPlayer.create(context, R.raw.fs);
                                break;
                            case "g":
                                mp = MediaPlayer.create(context, R.raw.g);
                                break;
                            case "gs":
                                mp = MediaPlayer.create(context, R.raw.gs);
                                break;
                            case "cs":
                                mp = MediaPlayer.create(context, R.raw.cs);
                                break;
                            default:
                                mp = MediaPlayer.create(context, R.raw.voids);
                                break;
                        }
                        mp.start();
                        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                    else{
                        tmr2.cancel();
                    }
                }catch(Exception ex) {

                }
            }
        };
        tmr1.scheduleAtFixedRate(tmr2, 50, 50);
    }

}
