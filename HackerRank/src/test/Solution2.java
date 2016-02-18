package test;

import java.util.*;

public class Solution2 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int playerId = in.nextInt(); // your id (0 to 4)

		// game loop
		while (true) {
			int playerChipCount = in.nextInt(); // The number of chips under
												// your control
			int entityCount = in.nextInt(); // The total number of entities on
											// the table, including your chips

			int[] cid = new int[entityCount];
			int[] cPlayer = new int[entityCount];
			float[] cX = new float[entityCount];
			float[] cY = new float[entityCount];
			float[] cRadius = new float[entityCount];
			float[] cVX = new float[entityCount];
			float[] cVY = new float[entityCount];

			List<Integer> playerIds = new ArrayList<Integer>();

			for (int i = 0; i < entityCount; i++) {
				int id = in.nextInt(); // Unique identifier for this entity
				int player = in.nextInt(); // The owner of this entity (-1 for
											// neutral droplets)
				float radius = in.nextFloat(); // the radius of this entity
				float x = in.nextFloat(); // the X coordinate (0 to 799)
				float y = in.nextFloat(); // the Y coordinate (0 to 514)
				float vx = in.nextFloat(); // the speed of this entity along the
											// X axis
				float vy = in.nextFloat(); // the speed of this entity along the
											// Y axis

				if (player == playerId) {
					playerIds.add(player);
				}

				cid[i] = id;
				cPlayer[i] = player;
				cRadius[i] = radius;
				cX[i] = x;
				cY[i] = y;
				cVX[i] = vx;
				cVY[i] = vy;
			}
			for (int i = 0; i < playerChipCount; i++) {

				int itemId = playerIds.get(i);
				float px = cX[itemId];
				float py = cY[itemId];

				Float minDist = 99999F;
				Integer minId = 0;

				for (int k = 0; k < entityCount; k++) {
					if (cPlayer[k] == playerId) {
						continue;
					}
					if (cRadius[itemId] < cRadius[k]){
						continue;
					}
					float dist = (float) Math.sqrt(Math.pow(px - cX[k], 2)
							+ Math.pow(py - cY[k], 2));
					if (dist < minDist) {
						minDist = dist;
						minId = k;
					}
				}

				System.out.println(cX[minId] + " " + cY[minId]);
			}
		}
	}
}
