private Node doubleWithLeftChildCase2(Node k3) // right - left
{
	Node k1 = k3.left;
	Node k2 = k1.right;
	k1.right = k2.left;
	k2.left = k1;
	k3.left = k2.right;
	k2.right = k3;
	k2.height = Math.max(height(k2.left), height(k2.right)) + 1;
	k1.height = Math.max(height(k1.left), height(k1.right)) + 1;
	k3.height = k1.height;
	return k2;
}

private Node doubleWithRightChildCase3(Node k3) // left - right
{
	Node k1 = k3.right;
	Node k2 = k1.left;
	k1.left = k2.right;
	k2.right = k1;		
	k3.right = k2.left;
	k2.left = k3;
	k2.height = Math.max(height(k2.left), height(k2.right)) + 1;
	k1.height = Math.max(height(k1.left), height(k1.right)) + 1;
	k3.height = k1.height;
	return k2;
}