package _06_vault;

public class SecretAgent {
	void findCode(Vault vault) {
		for(int i=0; i<=1000000;i++) {
			if(vault.tryCode(i)) {
				System.out.print(i);
				return;
			}
		}
		System.out.print("No code found");
	}
}
