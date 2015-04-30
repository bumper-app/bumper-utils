/**
 * Copyright (C) 2015 Mathieu Nayrolles
 *
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.bumper.utils.helpers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CommandRunnable implements Runnable {

    private static int nbCommand = 0;
    private static double totalTime = 0;
    private static double averageTime = 0;
    private final String command;
    private final String id;

    public CommandRunnable(String command, String id) {
        this.command = command;
        this.id = id;
    }

    @Override
    public void run() {

        nbCommand++;

        Process p;

        try {
            long prev = System.currentTimeMillis();

            p = Runtime
                    .getRuntime()
                    .exec(command);

            BufferedReader in = new BufferedReader(new InputStreamReader(p.getErrorStream()));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            p.waitFor();

            in.close();

            long now = System.currentTimeMillis();
            totalTime += now - prev;
            averageTime = totalTime / nbCommand;
            double minutesRemaining = (((27400 - nbCommand) * averageTime) / 1000) / 60;

            System.out.println(id + " (in " + (now - prev) / 1000d + "s; avg:" + averageTime / 1000
                    + "; at current avg:" + minutesRemaining + " min remaining");

        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (InterruptedException ex) {
            Logger.getLogger(CommandRunnable.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
