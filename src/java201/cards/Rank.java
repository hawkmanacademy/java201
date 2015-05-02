package java201.cards;

public enum Rank {
	Ace() {
		public int intvalue() {
			return 14;
		}
	},
	Two() {
		public int intvalue() {
			return 2;
		}
	},
	Three() {
		public int intvalue() {
			return 3;
		}
	},
	Four() {
		public int intvalue() {
			return 4;
		}
	},
	Five() {
		public int intvalue() {
			return 5;
		}
	},
	Six() {
		public int intvalue() {
			return 6;
		}
	},
	Seven() {
		public int intvalue() {
			return 7;
		}
	},
	Eight() {
		public int intvalue() {
			return 8;
		}
	},
	Nine() {
		public int intvalue() {
			return 9;
		}
	},
	Ten() {
		public int intvalue() {
			return 10;
		}
	},
	Jack() {
		public int intvalue() {
			return 11;
		}
	},
	Queen() {
		public int intvalue() {
			return 12;
		}
	},
	King() {
		public int intvalue() {
			return 13;
		}
	};
	public abstract int intvalue();
}
